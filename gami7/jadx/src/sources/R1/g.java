package R1;

import z2.h;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f5506a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5507b;

    public g(f fVar, b bVar) {
        this.f5506a = fVar;
        this.f5507b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return h.a(this.f5506a, gVar.f5506a) && h.a(this.f5507b, gVar.f5507b);
    }

    public final int hashCode() {
        int hashCode = this.f5506a.hashCode() * 31;
        b bVar = this.f5507b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        return "ScheduleWithClient(schedule=" + this.f5506a + ", client=" + this.f5507b + ')';
    }
}
