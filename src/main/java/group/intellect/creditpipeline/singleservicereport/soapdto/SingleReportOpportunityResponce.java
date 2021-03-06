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
public class SingleReportOpportunityResponce {

    private String dateFrom;
    private String dateTo;
    private int count;
    private OpportunityData data;
}
