package V;

import B1.t;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: b, reason: collision with root package name */
    public final o f5853b;

    /* renamed from: c, reason: collision with root package name */
    public final o f5854c;

    public i(o oVar, o oVar2) {
        this.f5853b = oVar;
        this.f5854c = oVar2;
    }

    @Override // V.o
    public final boolean c(y2.c cVar) {
        return this.f5853b.c(cVar) && this.f5854c.c(cVar);
    }

    @Override // V.o
    public final Object e(Object obj, y2.e eVar) {
        return this.f5854c.e(this.f5853b.e(obj, eVar), eVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (z2.h.a(this.f5853b, iVar.f5853b) && z2.h.a(this.f5854c, iVar.f5854c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5854c.hashCode() * 31) + this.f5853b.hashCode();
    }

    public final String toString() {
        return t.k(new StringBuilder("["), (String) e("", h.f5852i), ']');
    }
}
