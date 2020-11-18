package group.intellect.creditpipeline.singleservicereport.soapdto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.xml.bind.annotation.XmlType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlType
public class OpportunityData {

    private String unitNameFilial;
    private String unitNameOffice;
    private String unitNameDepartment;
    private String unitNameUprav;
    private String unitNameOtdel;
    private String unitNameGroup;
    private String responsiblePersonPersonnellNumber;
    private String responsiblePersonName;
    private String clientHoldingName;
    private String clientName;
    private int clientInn;
    private int clientId;
    private String clientStatusName;
    private String clientSegmentValue;
    private int opportunityId;
    private String typeName;
    private int productId;
    private String productDescription;
    private String statusName;
    private String openDate;
    private String contractSignDate;
    private String salesStageName;
    private String probability;
    private String currency;
    private String moneyAmount;
    private String description;
    private String comment;
    private String reasonName;
    private int realDealId;
    private String matchingDate;
    private String concludedDealProductName;
    private String concludedDealDate;
    private int concludedDealProductId;
    private String marketingCampaignName;
    private String triggerName;
    private String crossSell;
}
