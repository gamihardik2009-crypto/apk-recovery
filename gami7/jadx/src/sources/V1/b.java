package V1;

import Q1.p;
import W1.P;
import Y1.H;
import a2.l;
import android.content.Context;
import androidx.lifecycle.X;
import androidx.lifecycle.Z;
import d2.n;
import z2.h;

/* loaded from: classes.dex */
public final class b implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final p f5881a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5882b;

    public b(p pVar, Context context) {
        h.f(pVar, "repository");
        this.f5881a = pVar;
        this.f5882b = context;
    }

    @Override // androidx.lifecycle.Z
    public final X a(Class cls) {
        a aVar = new a(0, this);
        boolean isAssignableFrom = cls.isAssignableFrom(H.class);
        p pVar = this.f5881a;
        if (isAssignableFrom) {
            return new H(pVar, aVar);
        }
        if (cls.isAssignableFrom(P.class)) {
            return new P(pVar);
        }
        if (cls.isAssignableFrom(n.class)) {
            return new n(pVar);
        }
        if (cls.isAssignableFrom(l.class)) {
            return new l(pVar, aVar);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
