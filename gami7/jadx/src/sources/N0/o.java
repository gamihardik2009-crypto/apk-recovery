package N0;

import B1.C;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final o f5002c = new o(C.X(0), C.X(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f5003a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5004b;

    public o(long j3, long j4) {
        this.f5003a = j3;
        this.f5004b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return O0.m.a(this.f5003a, oVar.f5003a) && O0.m.a(this.f5004b, oVar.f5004b);
    }

    public final int hashCode() {
        O0.n[] nVarArr = O0.m.f5152b;
        return Long.hashCode(this.f5004b) + (Long.hashCode(this.f5003a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) O0.m.d(this.f5003a)) + ", restLine=" + ((Object) O0.m.d(this.f5004b)) + ')';
    }
}
