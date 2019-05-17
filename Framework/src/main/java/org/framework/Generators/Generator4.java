package org.framework.Generators;

import org.framework.Annotations.ConfigurationInfo;
import org.framework.Interfaces.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationInfo(type="type2",version = 2,generator = "generator4")
public class Generator4 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
