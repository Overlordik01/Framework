package org.framework.Generators;

import org.framework.Interfaces.GeneratorRealisation;
import org.springframework.stereotype.Controller;

@Controller
public class Generator5 implements GeneratorRealisation {
    public void toGenerateReport(){};
    public void toCheckTheStatusOfReportGeneration(){};
    public void toCancelReportGeneration(){};
    public void toDownloadTheReport(){};
}
