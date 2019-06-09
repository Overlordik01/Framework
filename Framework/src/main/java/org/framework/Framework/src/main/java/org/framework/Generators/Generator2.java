package org.framework.Generators;

import org.framework.Generators.Annotation.ConfigurationInfo;
import org.framework.Generators.Interface.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationInfo(type="type1",version = 2,generator = "generator2")
public class Generator2 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
