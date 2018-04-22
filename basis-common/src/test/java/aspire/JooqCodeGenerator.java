package aspire;

import org.jooq.util.GenerationTool;
import org.junit.Test;

public class JooqCodeGenerator {

    @Test
    public void gen() throws Exception {
        String path = this.getClass().getResource("/jooq-config.xml").toURI().getPath();
        String[] args = new String[]{path};
        GenerationTool.main(args);
    }
}