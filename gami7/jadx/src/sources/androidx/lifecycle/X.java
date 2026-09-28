package androidx.lifecycle;

import java.util.Iterator;
import m1.C0857c;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public final C0857c f6875a = new C0857c();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C0857c c0857c = this.f6875a;
        if (c0857c != null) {
            if (c0857c.f8639d) {
                C0857c.a(autoCloseable);
                return;
            }
            synchronized (c0857c.f8636a) {
                autoCloseable2 = (AutoCloseable) c0857c.f8637b.put(str, autoCloseable);
            }
            C0857c.a(autoCloseable2);
        }
    }

    public final void b() {
        C0857c c0857c = this.f6875a;
        if (c0857c != null && !c0857c.f8639d) {
            c0857c.f8639d = true;
            synchronized (c0857c.f8636a) {
                try {
                    Iterator it = c0857c.f8637b.values().iterator();
                    while (it.hasNext()) {
                        C0857c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c0857c.f8638c.iterator();
                    while (it2.hasNext()) {
                        C0857c.a((AutoCloseable) it2.next());
                    }
                    c0857c.f8638c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C0857c c0857c = this.f6875a;
        if (c0857c == null) {
            return null;
        }
        synchronized (c0857c.f8636a) {
            autoCloseable = (AutoCloseable) c0857c.f8637b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
