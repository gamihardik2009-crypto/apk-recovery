package n1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final D f9095a;

    /* renamed from: c, reason: collision with root package name */
    public final String f9097c;

    /* renamed from: b, reason: collision with root package name */
    public final int f9096b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9098d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9099e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9100f = new LinkedHashMap();

    public t(D d3, String str) {
        this.f9095a = d3;
        this.f9097c = str;
    }

    public s a() {
        s b3 = b();
        Object obj = null;
        b3.f9089j = null;
        Iterator it = this.f9098d.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            B1.t.w(entry.getValue());
            z2.h.f(str, "argumentName");
            z2.h.f(null, "argument");
            throw null;
        }
        Iterator it2 = this.f9099e.iterator();
        while (it2.hasNext()) {
            b3.a((q) it2.next());
        }
        Iterator it3 = this.f9100f.entrySet().iterator();
        if (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            ((Number) entry2.getKey()).intValue();
            B1.t.w(entry2.getValue());
            z2.h.f(null, "action");
            throw null;
        }
        String str2 = this.f9097c;
        if (str2 != null) {
            int i2 = s.f9086p;
            if (!(!H2.l.V(str2))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String v3 = l0.c.v(str2);
            b3.f9093n = v3.hashCode();
            b3.a(new q(v3));
            ArrayList arrayList = b3.f9090k;
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (z2.h.a(((q) next).f9069a, l0.c.v(b3.f9094o))) {
                    obj = next;
                    break;
                }
            }
            z2.v.a(arrayList);
            arrayList.remove(obj);
            b3.f9094o = str2;
        }
        int i3 = this.f9096b;
        if (i3 != -1) {
            b3.f9093n = i3;
        }
        return b3;
    }

    public s b() {
        return this.f9095a.a();
    }
}
