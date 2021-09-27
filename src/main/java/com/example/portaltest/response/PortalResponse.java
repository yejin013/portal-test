package com.example.portaltest.response;

import com.example.portaltest.dto.*;
import com.example.portaltest.utils.ModelMapperUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.portaltest.entity.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class PortalResponse {
    CountDto serviceCount; // AiDO 서비스 카운트
    RevenueDto serviceRevenue; // AiDO 서비스 수익
    UtilizationDto cloudUtilization; // AiDO 클라우드 사용률
    CountDto modelCount; // AiDO AI모델 카운트
    MonthServiceCountListDto monthServiceCount; // 월별 AiDO 서비스 사용
    MonthServiceUsesSumListDto monthSumPrice; // 월별 AiDO 서비스 가격
    CountDto activeService; // 액티브 서비스 수
    AccountListDto account; // 계약건
    CloudCostToRevenueRatioListDto cloudCostToRevenueRatio; // 클라우드 비용대비 수익비율
    MonthlyAccountListDto monthlyAccount; // 이번달 계약건
    ServiceVersionListDto serviceVersion; // 서비스 버전 현황
    NumberOfServiceUsesListDto numberOfServiceUses; // 서비스 이용 건수
    NumberOfServiceUsesListDto numberOfServiceUsesRatio; // 서비스 이용 비중
    ServiceUpdateListDto serviceUpdate; // AiDO 서비스 업데이트
    ServiceUpdateListDto serviceUpdateExcept100; // AiDO 서비스 업데이트 상태
}
