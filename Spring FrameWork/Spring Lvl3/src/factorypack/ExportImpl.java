package factorypack;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ExportImpl extends DelegatingIntroductionInterceptor implements Exporter{
@Override
public void doExport() {
	System.out.println("do export method called.......");
}
}
