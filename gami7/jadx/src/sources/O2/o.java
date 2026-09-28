package O2;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final K2.d f5202a;

    static {
        String str;
        Object next;
        int i2 = w.f5210a;
        K2.d dVar = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List k02 = G2.i.k0(G2.i.g0(B1.t.y()));
        Iterator it = k02.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int b3 = ((K2.a) next).b();
                do {
                    Object next2 = it.next();
                    int b4 = ((K2.a) next2).b();
                    if (b3 < b4) {
                        next = next2;
                        b3 = b4;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        K2.a aVar = (K2.a) next;
        if (aVar != null) {
            try {
                dVar = aVar.a(k02);
            } catch (Throwable unused2) {
                aVar.c();
            }
            if (dVar != null) {
                f5202a = dVar;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
