package D0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class t implements z {
    @Override // D0.z
    public StaticLayout a(A a3) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(a3.f921a, a3.f922b, a3.f923c, a3.f924d, a3.f925e);
        obtain.setTextDirection(a3.f926f);
        obtain.setAlignment(a3.f927g);
        obtain.setMaxLines(a3.f928h);
        obtain.setEllipsize(a3.f929i);
        obtain.setEllipsizedWidth(a3.f930j);
        obtain.setLineSpacing(a3.f932l, a3.f931k);
        obtain.setIncludePad(a3.f934n);
        obtain.setBreakStrategy(a3.f936p);
        obtain.setHyphenationFrequency(a3.f938s);
        obtain.setIndents(a3.f939t, a3.f940u);
        int i2 = Build.VERSION.SDK_INT;
        u.a(obtain, a3.f933m);
        if (i2 >= 28) {
            w.a(obtain, a3.f935o);
        }
        if (i2 >= 33) {
            x.b(obtain, a3.q, a3.f937r);
        }
        return obtain.build();
    }
}
