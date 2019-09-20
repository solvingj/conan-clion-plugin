package conan.commands;

import conan.testUtils.OpenSSLProjectImpl;
import org.gradle.internal.impldep.org.junit.platform.commons.util.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class VersionTest extends ConanCommandTestBase {

    @Test
    public void testVersion() {
        Version version = this.mockedComamnd(new Version(new OpenSSLProjectImpl()));
        String vString = version.run_sync();
        String[] parts = vString.split("\\s+");
        Assert.assertEquals(parts[0], "Conan");
        Assert.assertEquals(parts[1], "version");
        Assert.assertTrue(!StringUtils.isBlank(parts[2]));
    }

}
