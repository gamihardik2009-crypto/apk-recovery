package androidx.compose.foundation;

import V.n;
import V.o;
import n.C0886E;
import r.l;
import t0.S;
import u0.N;

/* loaded from: classes.dex */
public abstract class c {
    static {
        int i2 = N.f10928e;
        new S() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
            public final boolean equals(Object obj) {
                return this == obj;
            }

            public final int hashCode() {
                return System.identityHashCode(this);
            }

            @Override // t0.S
            public final n l() {
                return new C0886E();
            }

            @Override // t0.S
            public final /* bridge */ /* synthetic */ void m(n nVar) {
            }
        };
    }

    public static final o a(o oVar, boolean z3, l lVar) {
        return oVar.k(z3 ? new FocusableElement(lVar) : V.l.f5857b);
    }
}
