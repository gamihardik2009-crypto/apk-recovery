package D0;

import B.AbstractC0010k;
import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public abstract class x {
    public static final boolean a(StaticLayout staticLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    public static final void b(StaticLayout.Builder builder, int i2, int i3) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        lineBreakStyle = AbstractC0010k.a().setLineBreakStyle(i2);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i3);
        build = lineBreakWordStyle.build();
        builder.setLineBreakConfig(build);
    }
}
