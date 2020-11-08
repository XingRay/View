import com.xingray.view.Color;
import org.junit.Test;

public class ColorTest {

    @Test
    public void test01() {
        Color color = Color.rgb(0xff, 0xff, 0, 0);
        System.out.println(color);
        assert color.getValue() == 0xffff0000;

        color.setGreen(0x88);
        System.out.println(color);
        assert color.getValue() == 0xffff8800;

        color = new Color();
        System.out.println(color);
        assert color.getValue() == 0;

        color = new Color(0x12345678);
        System.out.println(color);
        assert color.getValue() == 0x12345678;

        color = new Color(0xffffffff);
        System.out.println(color);
        assert color.getValue() == 0xffffffff;

        color = new Color(0);
        System.out.println(color);
        assert color.getValue() == 0;

        color = new Color(0xff, 0, 0);
        System.out.println(color);
        assert color.getValue() == 0xffff0000;

        color = new Color(0x22, 0x33, 0x44, 0x55);
        System.out.println(color);
        assert color.getValue() == 0x22334455;

        color = Color.rgb(0x01, 0x02, 0x03);
        System.out.println(color);
        assert color.getValue() == 0xff010203;

        color = Color.rgb(0x01, 0x02, 0x03, 0x04);
        System.out.println(color);
        assert color.getValue() == 0x01020304;

        color = Color.rgb(0.5, 0xff, 0, 0);
        System.out.println(color);
        assert color.getValue() == 0x7fff0000;

        color = Color.rgb(0xaa, 0xbb, 0xcc, 0xdd);
        color.setAlpha(0xff);
        System.out.println(color);
        assert color.getValue() == 0xffbbccdd;
        color.setAlpha(0);
        System.out.println(color);
        assert color.getValue() == 0x00bbccdd;
        color.setAlpha(0xf0);
        System.out.println(color);
        assert color.getValue() == 0xf0bbccdd;

        color = Color.rgb(0xaa, 0xbb, 0xcc, 0xdd);
        color.setRed(0xff);
        System.out.println(color);
        assert color.getValue() == 0xaaffccdd;
        color.setRed(0);
        System.out.println(color);
        assert color.getValue() == 0xaa00ccdd;
        color.setRed(0xf0);
        System.out.println(color);
        assert color.getValue() == 0xaaf0ccdd;

        color = Color.rgb(0xaa, 0xbb, 0xcc, 0xdd);
        color.setGreen(0xff);
        System.out.println(color);
        assert color.getValue() == 0xaabbffdd;
        color.setGreen(0);
        System.out.println(color);
        assert color.getValue() == 0xaabb00dd;
        color.setGreen(0xf0);
        System.out.println(color);
        assert color.getValue() == 0xaabbf0dd;

        color = Color.rgb(0xaa, 0xbb, 0xcc, 0xdd);
        color.setBlue(0xff);
        System.out.println(color);
        assert color.getValue() == 0xaabbccff;
        color.setBlue(0);
        System.out.println(color);
        assert color.getValue() == 0xaabbcc00;
        color.setBlue(0xf0);
        System.out.println(color);
        assert color.getValue() == 0xaabbccf0;
    }
}
