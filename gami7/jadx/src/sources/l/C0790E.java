package l;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0790E f8127b = new C0790E(new V(null, null, null, null, false, null, 63));

    /* renamed from: a, reason: collision with root package name */
    public final V f8128a;

    public C0790E(V v3) {
        this.f8128a = v3;
    }

    public final C0790E a(C0790E c0790e) {
        V v3 = c0790e.f8128a;
        G g3 = v3.f8167a;
        V v4 = this.f8128a;
        if (g3 == null) {
            g3 = v4.f8167a;
        }
        G g4 = g3;
        T t3 = v3.f8168b;
        if (t3 == null) {
            t3 = v4.f8168b;
        }
        T t4 = t3;
        C0810t c0810t = v3.f8169c;
        if (c0810t == null) {
            c0810t = v4.f8169c;
        }
        C0810t c0810t2 = c0810t;
        L l3 = v3.f8170d;
        if (l3 == null) {
            l3 = v4.f8170d;
        }
        L l4 = l3;
        Map map = v4.f8172f;
        z2.h.f(map, "<this>");
        Map map2 = v3.f8172f;
        z2.h.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0790E(new V(g4, t4, c0810t2, l4, false, linkedHashMap, 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0790E) && z2.h.a(((C0790E) obj).f8128a, this.f8128a);
    }

    public final int hashCode() {
        return this.f8128a.hashCode();
    }

    public final String toString() {
        if (z2.h.a(this, f8127b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        V v3 = this.f8128a;
        G g3 = v3.f8167a;
        sb.append(g3 != null ? g3.toString() : null);
        sb.append(",\nSlide - ");
        T t3 = v3.f8168b;
        sb.append(t3 != null ? t3.toString() : null);
        sb.append(",\nShrink - ");
        C0810t c0810t = v3.f8169c;
        sb.append(c0810t != null ? c0810t.toString() : null);
        sb.append(",\nScale - ");
        L l3 = v3.f8170d;
        sb.append(l3 != null ? l3.toString() : null);
        return sb.toString();
    }
}
