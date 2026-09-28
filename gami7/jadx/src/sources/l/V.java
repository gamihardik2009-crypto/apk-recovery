package l;

import java.util.LinkedHashMap;
import java.util.Map;
import n2.C0971w;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final G f8167a;

    /* renamed from: b, reason: collision with root package name */
    public final T f8168b;

    /* renamed from: c, reason: collision with root package name */
    public final C0810t f8169c;

    /* renamed from: d, reason: collision with root package name */
    public final L f8170d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8171e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f8172f;

    public V(G g3, T t3, C0810t c0810t, L l3, boolean z3, Map map) {
        this.f8167a = g3;
        this.f8168b = t3;
        this.f8169c = c0810t;
        this.f8170d = l3;
        this.f8171e = z3;
        this.f8172f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v3 = (V) obj;
        return z2.h.a(this.f8167a, v3.f8167a) && z2.h.a(this.f8168b, v3.f8168b) && z2.h.a(this.f8169c, v3.f8169c) && z2.h.a(this.f8170d, v3.f8170d) && this.f8171e == v3.f8171e && z2.h.a(this.f8172f, v3.f8172f);
    }

    public final int hashCode() {
        G g3 = this.f8167a;
        int hashCode = (g3 == null ? 0 : g3.hashCode()) * 31;
        T t3 = this.f8168b;
        int hashCode2 = (hashCode + (t3 == null ? 0 : t3.hashCode())) * 31;
        C0810t c0810t = this.f8169c;
        int hashCode3 = (hashCode2 + (c0810t == null ? 0 : c0810t.hashCode())) * 31;
        L l3 = this.f8170d;
        return this.f8172f.hashCode() + B1.t.f((hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31, 31, this.f8171e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f8167a + ", slide=" + this.f8168b + ", changeSize=" + this.f8169c + ", scale=" + this.f8170d + ", hold=" + this.f8171e + ", effectsMap=" + this.f8172f + ')';
    }

    public /* synthetic */ V(G g3, T t3, C0810t c0810t, L l3, boolean z3, LinkedHashMap linkedHashMap, int i2) {
        this((i2 & 1) != 0 ? null : g3, (i2 & 2) != 0 ? null : t3, (i2 & 4) != 0 ? null : c0810t, (i2 & 8) == 0 ? l3 : null, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? C0971w.f9166h : linkedHashMap);
    }
}
