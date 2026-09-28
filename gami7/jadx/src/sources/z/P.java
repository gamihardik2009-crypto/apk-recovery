package z;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: g, reason: collision with root package name */
    public static final P f11529g = new P(63, null);

    /* renamed from: a, reason: collision with root package name */
    public final y2.c f11530a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.c f11531b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.c f11532c;

    /* renamed from: d, reason: collision with root package name */
    public final y2.c f11533d;

    /* renamed from: e, reason: collision with root package name */
    public final y2.c f11534e;

    /* renamed from: f, reason: collision with root package name */
    public final y2.c f11535f;

    public P(int i2, y2.c cVar) {
        cVar = (i2 & 4) != 0 ? null : cVar;
        this.f11530a = null;
        this.f11531b = null;
        this.f11532c = cVar;
        this.f11533d = null;
        this.f11534e = null;
        this.f11535f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p3 = (P) obj;
        return this.f11530a == p3.f11530a && this.f11531b == p3.f11531b && this.f11532c == p3.f11532c && this.f11533d == p3.f11533d && this.f11534e == p3.f11534e && this.f11535f == p3.f11535f;
    }

    public final int hashCode() {
        y2.c cVar = this.f11530a;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        y2.c cVar2 = this.f11531b;
        int hashCode2 = (hashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31;
        y2.c cVar3 = this.f11532c;
        int hashCode3 = (hashCode2 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31;
        y2.c cVar4 = this.f11533d;
        int hashCode4 = (hashCode3 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31;
        y2.c cVar5 = this.f11534e;
        int hashCode5 = (hashCode4 + (cVar5 != null ? cVar5.hashCode() : 0)) * 31;
        y2.c cVar6 = this.f11535f;
        return hashCode5 + (cVar6 != null ? cVar6.hashCode() : 0);
    }
}
