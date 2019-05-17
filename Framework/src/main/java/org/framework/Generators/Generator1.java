package org.framework.Generators;

import org.framework.Annotations.ConfigurationInfo;
import org.framework.Interfaces.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationInfo(type="type1",version = 1)
public class Generator1 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
