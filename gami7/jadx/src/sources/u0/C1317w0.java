package u0;

import java.lang.reflect.Method;
import q2.InterfaceC1077h;

/* renamed from: u0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317w0 implements InterfaceC1077h, H0.c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ C1317w0 f11247h = new C1317w0();

    /* renamed from: i, reason: collision with root package name */
    public static final d1 f11248i = new d1();

    public static final boolean a() {
        Class cls = C1314v.f11158F0;
        try {
            if (C1314v.f11158F0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C1314v.f11158F0 = cls2;
                C1314v.f11159G0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C1314v.f11159G0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
