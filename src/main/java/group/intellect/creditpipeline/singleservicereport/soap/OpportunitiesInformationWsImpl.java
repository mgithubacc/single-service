package group.intellect.creditpipeline.singleservicereport.soap;

import group.intellect.creditpipeline.singleservicereport.soapdto.OpportunityData;
import group.intellect.creditpipeline.singleservicereport.soapdto.SingleReportOpportunityRequest;
import group.intellect.creditpipeline.singleservicereport.soapdto.SingleReportOpportunityResponce;

public class OpportunitiesInformationWsImpl implements OpportunitiesInformationWs{
    @Override
    public SingleReportOpportunityResponce processPayment(SingleReportOpportunityRequest paymentProcessorRequest) {
        OpportunityData opportunityData = new OpportunityData();
        opportunityData.setClientName("Client Name");
        opportunityData.setComment("Comment");
        return new SingleReportOpportunityResponce(
                "12/12/2020", "24/12/2020", 1, opportunityData);
    }
}
