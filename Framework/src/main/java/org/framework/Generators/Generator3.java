package org.framework.Generators;

import org.framework.Annotation.ConfigurationInfo;
import org.framework.Interface.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationInfo(type="type2",version = 1,generator = "generator3")
public class Generator3 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
