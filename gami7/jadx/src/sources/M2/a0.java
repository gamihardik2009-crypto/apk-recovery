package M2;

import H.C0179q2;
import n2.AbstractC0961m;
import n2.AbstractC0962n;
import o2.C0996b;

/* loaded from: classes.dex */
public final class a0 implements U {

    /* renamed from: a, reason: collision with root package name */
    public final long f4856a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4857b;

    public a0(long j3, long j4) {
        this.f4856a = j3;
        this.f4857b = j4;
        if (j3 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j3 + " ms) cannot be negative").toString());
        }
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j4 + " ms) cannot be negative").toString());
    }

    @Override // M2.U
    public final InterfaceC0343g a(N2.F f3) {
        return P.g(new C0179q2(P.o(f3, new Y(this, null)), new Z(2, null), 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f4856a == a0Var.f4856a && this.f4857b == a0Var.f4857b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4857b) + (Long.hashCode(this.f4856a) * 31);
    }

    public final String toString() {
        C0996b c0996b = new C0996b(2);
        long j3 = this.f4856a;
        if (j3 > 0) {
            c0996b.add("stopTimeout=" + j3 + "ms");
        }
        long j4 = this.f4857b;
        if (j4 < Long.MAX_VALUE) {
            c0996b.add("replayExpiration=" + j4 + "ms");
        }
        return B1.t.k(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC0961m.L(AbstractC0962n.e(c0996b), null, null, null, null, 63), ')');
    }
}
