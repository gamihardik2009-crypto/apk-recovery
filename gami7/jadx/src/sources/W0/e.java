package W0;

import C1.y;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final y f5896a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f5896a = new h();
        } else if (i2 >= 28) {
            f5896a = new g();
        } else {
            f5896a = new f();
        }
        new C1.b(28);
    }
}
