package com.example.portaltest.service;

import com.example.portaltest.entity.AiDO;
import com.example.portaltest.entity.Company_AiDO;
import com.example.portaltest.entity.Company_AiDO_Month;
import com.example.portaltest.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PortalService {
    private final CompanyAiDORepository cmpnAidoRepo;
    private final CompanyAiDOMonRepository monRepo;
    private final AiDOServerRepository serverRepo;
    private final AiDOModelRepository modelRepo;
    private final AiDORepository aidoRepo;
    private final CompanyRepository cmpnRepo;
    private final JoinRepository joinRepo;

    // AiDO 서비스 카운트
    public Long serviceCount() {
        return cmpnAidoRepo.count();
    }

    // AiDO 서비스 수익
    public Float serviceRevenue() {
        return monRepo.findPriceTotal();
    }

    // AiDO 클라우드 사용률
    public Float cloudUtilization() {
        return serverRepo.findSumUtilization() / serverRepo.count();
    }

    // AiDO AI모델 카운트
    public Long modelCount() {
        return modelRepo.count();
    }

    // 월별 AiDO 서비스 사용
    public List<Object[]> monthServiceCount() {
        return monRepo.findMonthServiceUsesCount();
    }

    // 월별 AiDO 서비스 가격
    public List<Object[]> monthSumPrice() {
        return monRepo.findMonthServiceUsesSum();
    }

    // 액티브 서비스 수
    public Long activeService() {
        return serverRepo.countActiveService();
    }

    // 계약건
    public List<Company_AiDO> account(){
        return cmpnAidoRepo.findTop5ByOrderByAccount_datetime();
    }

    // 클라우드 비용대비 수익비율
    public List<Object[]> cloudCostToRevenueRatio() {
        return joinRepo.cloudCostToRevenueRatio();
    }

    // 이번달 계약건
    public List<Company_AiDO_Month> monthlyAccount() {
        return monRepo.findTop4ByOrderByCode();
    }

    // 서비스 버전 현황
    public List<AiDO> serviceVersion() {
        return aidoRepo.findAll();
    }

    // 서비스 이용 건수, 서비스 이용 비중
    public List<Object[]> numberOfServiceUses() {
        return cmpnAidoRepo.serviceCount();
    }

    // AiDO 서비스 업데이트 및 업데이트 상태 : 업데이트 상태의 경우 100%만 제외해서 전달(함수 분할 필요성 느끼지 못함)
    public List<AiDO> serviceUpdate() {
        return aidoRepo.findAll();
    }
}
