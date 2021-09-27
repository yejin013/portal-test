package com.example.portaltest.controller;

import com.example.portaltest.dto.*;
import com.example.portaltest.response.PortalResponse;
import com.example.portaltest.service.PortalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/index")
public class PortalController {
    private final PortalService portalService;

    @GetMapping()
    public PortalResponse portalApi() {
        CountDto serviceCount = portalService.serviceCount(); // AiDO 서비스 카운트
        System.out.println(serviceCount.getCount());
        RevenueDto serviceRevenue = portalService.serviceRevenue(); // AiDO 서비스 수익
        UtilizationDto cloudUtilization = portalService.cloudUtilization(); // AiDO 클라우드 사용률
        CountDto modelCount = portalService.modelCount(); // AiDO AI모델 카운트
        MonthServiceCountListDto monthServiceCount = portalService.monthServiceCount(); // 월별 AiDO 서비스 사용
        MonthServiceUsesSumListDto monthSumPrice = portalService.monthSumPrice(); // 월별 AiDO 서비스 가격
        CountDto activeService = portalService.activeService(); // 액티브 서비스 수
        AccountListDto account = portalService.account(); // 계약건
        CloudCostToRevenueRatioListDto cloudCostToRevenueRatio = portalService.cloudCostToRevenueRatio(); // 클라우드 비용대비 수익비율
        MonthlyAccountListDto monthlyAccount = portalService.monthlyAccount(); // 이번달 계약건
        ServiceVersionListDto serviceVersion = portalService.serviceVersion(); // 서비스 버전 현황
        NumberOfServiceUsesListDto numberOfServiceUses = portalService.numberOfServiceUses(); // 서비스 이용 건수
        NumberOfServiceUsesListDto numberOfServiceUsesRatio = portalService.numberOfServiceUsesRatio(); // 서비스 이용 비중
        ServiceUpdateListDto serviceUpdate = portalService.serviceUpdate(); // AiDO 서비스 업데이트
        ServiceUpdateListDto serviceUpdateExcept100 = portalService.serviceUpdateExcept100(); // AiDO 서비스 업데이트 상태

        return new PortalResponse(serviceCount, serviceRevenue, cloudUtilization, modelCount, monthServiceCount,
                monthSumPrice, activeService, account, cloudCostToRevenueRatio, monthlyAccount, serviceVersion,
                numberOfServiceUses, numberOfServiceUsesRatio, serviceUpdate, serviceUpdateExcept100);
    }
}
