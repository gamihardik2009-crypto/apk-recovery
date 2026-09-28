package z0;

import java.io.Serializable;
import m2.C0880v;
import z2.t;
import z2.u;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements y2.c, z2.e, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public final Object f11882h;

    public i(L.d dVar) {
        this.f11882h = dVar;
    }

    @Override // z2.e
    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.getClass();
        return z2.h.a(this.f11882h, iVar.f11882h) && z2.h.a(L.d.class, L.d.class);
    }

    public final int hashCode() {
        Object obj = this.f11882h;
        return ((((((((((L.d.class.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31) + 96417) * 31) + 1636195860) * 31) + 1237) * 31) + 1) * 31) + 4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        ((L.d) this.f11882h).b((k) obj);
        return C0880v.f8657a;
    }

    public final String toString() {
        t.f11910a.getClass();
        return u.a(this);
    }
}
