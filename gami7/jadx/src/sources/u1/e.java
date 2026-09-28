package u1;

import android.os.Bundle;
import androidx.lifecycle.C0462k;
import i.C0701b;
import i.C0702c;
import i.C0705f;
import java.util.Iterator;
import java.util.Map;
import z2.h;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f11262b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f11263c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11264d;

    /* renamed from: e, reason: collision with root package name */
    public C1324a f11265e;

    /* renamed from: a, reason: collision with root package name */
    public final C0705f f11261a = new C0705f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f11266f = true;

    public final Bundle a(String str) {
        h.f(str, "key");
        if (!this.f11264d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f11263c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f11263c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f11263c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f11263c = null;
        }
        return bundle2;
    }

    public final InterfaceC1327d b() {
        String str;
        InterfaceC1327d interfaceC1327d;
        Iterator it = this.f11261a.iterator();
        do {
            C0701b c0701b = (C0701b) it;
            if (!c0701b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0701b.next();
            h.e(entry, "components");
            str = (String) entry.getKey();
            interfaceC1327d = (InterfaceC1327d) entry.getValue();
        } while (!h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC1327d;
    }

    public final void c(String str, InterfaceC1327d interfaceC1327d) {
        Object obj;
        h.f(str, "key");
        h.f(interfaceC1327d, "provider");
        C0705f c0705f = this.f11261a;
        C0702c a3 = c0705f.a(str);
        if (a3 != null) {
            obj = a3.f7793i;
        } else {
            C0702c c0702c = new C0702c(str, interfaceC1327d);
            c0705f.f7802k++;
            C0702c c0702c2 = c0705f.f7800i;
            if (c0702c2 == null) {
                c0705f.f7799h = c0702c;
                c0705f.f7800i = c0702c;
            } else {
                c0702c2.f7794j = c0702c;
                c0702c.f7795k = c0702c2;
                c0705f.f7800i = c0702c;
            }
            obj = null;
        }
        if (((InterfaceC1327d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (!this.f11266f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        C1324a c1324a = this.f11265e;
        if (c1324a == null) {
            c1324a = new C1324a(this);
        }
        this.f11265e = c1324a;
        try {
            C0462k.class.getDeclaredConstructor(null);
            C1324a c1324a2 = this.f11265e;
            if (c1324a2 != null) {
                c1324a2.f11258a.add(C0462k.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0462k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
