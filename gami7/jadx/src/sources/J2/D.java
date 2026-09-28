package J2;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final E f4353a;

    static {
        String str;
        K2.d dVar;
        int i2 = O2.w.f5210a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null || !Boolean.parseBoolean(str)) {
            dVar = C.q;
        } else {
            Q2.d dVar2 = H.f4356a;
            K2.d dVar3 = O2.o.f5202a;
            K2.d dVar4 = dVar3.f4610m;
            dVar = !(dVar3 instanceof E) ? C.q : dVar3;
        }
        f4353a = dVar;
    }
}
