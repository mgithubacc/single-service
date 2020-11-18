package group.intellect.creditpipeline.singleservicereport.soap;

import group.intellect.creditpipeline.singleservicereport.soapdto.SingleReportOpportunityRequest;
import group.intellect.creditpipeline.singleservicereport.soapdto.SingleReportOpportunityResponce;

import javax.jws.WebService;

@WebService
public interface OpportunitiesInformationWs {

    SingleReportOpportunityResponce processPayment(SingleReportOpportunityRequest paymentProcessorRequest);
}
