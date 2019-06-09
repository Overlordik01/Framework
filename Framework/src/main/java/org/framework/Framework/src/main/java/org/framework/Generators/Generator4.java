package org.framework.Generators;

import org.framework.Generators.Annotation.ConfigurationInfo;
import org.framework.Generators.Interface.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationInfo(type="type2",version = 2,generator = "generator4")
public class Generator4 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
