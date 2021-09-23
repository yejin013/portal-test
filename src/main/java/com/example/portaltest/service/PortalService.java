package com.example.portaltest.service;

import com.example.portaltest.dto.*;
import com.example.portaltest.entity.AiDO;
import com.example.portaltest.entity.Company_AiDO;
import com.example.portaltest.entity.Company_AiDO_Month;
import com.example.portaltest.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PortalService {
    private final CompanyAiDORepository cmpnAidoRepo;
    private final CompanyAiDOMonRepository monRepo;
    private final AiDOServerRepository serverRepo;
    private final AiDOModelRepository modelRepo;
    private final AiDORepository aidoRepo;
    private final CompanyRepository cmpnRepo;

    // AiDO 서비스 카운트
    public CountDto serviceCount() {
         return CountDto.builder()
                .count(cmpnAidoRepo.count())
                .build();
    }

    // AiDO 서비스 수익
    public RevenueDto serviceRevenue() {
        return RevenueDto.builder()
                .revenue(monRepo.findPriceTotal())
                .build();
    }

    // AiDO 클라우드 사용률
    public UtilizationDto cloudUtilization() {
        return UtilizationDto.builder()
                .utility(serverRepo.findSumUtilization() / serverRepo.count())
                .build();
    }

    // AiDO AI모델 카운트
    public CountDto modelCount() {
        return CountDto.builder()
                .count(modelRepo.count())
                .build();
    }

    // 월별 AiDO 서비스 사용
    public MonthServiceCountListDto monthServiceCount() {
        List<Object[]> list = monRepo.findMonthServiceUsesCount();
        return new MonthServiceCountListDto(list.stream().map(MonthServiceCountDto::new).collect(Collectors.toList()));
    }

    // 월별 AiDO 서비스 가격
    public MonthServiceUsesSumListDto monthSumPrice() {
        List<Object[]> list = monRepo.findMonthServiceUsesSum();
        return new MonthServiceUsesSumListDto(list.stream().map(MonthServiceUsesSumDto::new).collect(Collectors.toList()));
    }

    // 액티브 서비스 수
    public CountDto activeService() {
        return CountDto.builder()
                .count(serverRepo.countActiveService())
                .build();
    }

    // 계약건
    public AccountListDto account(){
        List<Company_AiDO> list = cmpnAidoRepo.findTop5ByOrderByAccount_datetime();
        return new AccountListDto(list.stream().map(Company_AiDO::toDto).collect(Collectors.toList()));
    }

    // 클라우드 비용대비 수익비율
    public CloudCostToRevenueRatioListDto cloudCostToRevenueRatio() {
        List<Object[]> list = monRepo.cloudCostToRevenueRatio();
        return new CloudCostToRevenueRatioListDto(list.stream().map(CloudCostToRevenueRatioDto::new).collect(Collectors.toList()));
    }

    // 이번달 계약건
    public MonthlyAccountListDto monthlyAccount() {
        List<Company_AiDO_Month> list = monRepo.findTop4ByOrderByCode();
        return new MonthlyAccountListDto(list.stream().map(Company_AiDO_Month::toDto).collect(Collectors.toList()));
    }

    // 서비스 버전 현황
    public ServiceVersionListDto serviceVersion() {
        List<AiDO> list = aidoRepo.findAll();
        return new ServiceVersionListDto(list.stream().map(AiDO::fromVersionToDto).collect(Collectors.toList()));
    }

    // 서비스 이용 건수, 서비스 이용 비중
    public NumberOfServiceUsesListDto numberOfServiceUses() {
        List<Object[]> list = cmpnAidoRepo.serviceCount();
        return new NumberOfServiceUsesListDto(list.stream().map(NumberOfServiceUsesDto::new).collect(Collectors.toList()));
    }

    // AiDO 서비스 업데이트 및 업데이트 상태 : 업데이트 상태의 경우 100%만 제외해서 전달(함수 분할 필요성 느끼지 못함)
    public ServiceUpdateListDto serviceUpdate() {
        List<AiDO> list =  aidoRepo.findAll();
        return new ServiceUpdateListDto(list.stream().map(AiDO::fromUpdateToDto).collect(Collectors.toList()));
    }

    // AiDO 서비스 업데이트 상태
    public ServiceUpdateListDto serviceUpdateExcept100() {
        List<AiDO> list =  aidoRepo.findAll();
        int size = list.size();

        for(int i = 0 ; i < size; i++) {
            if(list.get(i).getUpdate_rate() == 100) {
                list.remove(i);
                size--;
                i--;
            }
        }

        return new ServiceUpdateListDto(list.stream().map(AiDO::fromUpdateToDto).collect(Collectors.toList()));
    }
}
