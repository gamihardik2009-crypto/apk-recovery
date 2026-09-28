package androidx.compose.foundation;

import D.H;
import J.X0;
import V.o;
import n.C0883B;
import n.T;
import n.V;
import r.k;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final X0 f6584a = new X0(V.f8716j);

    public static final o a(o oVar, k kVar, T t3) {
        return t3 == null ? oVar : t3 instanceof C0883B ? oVar.k(new IndicationModifierElement(kVar, (C0883B) t3)) : V.a.b(oVar, new H(t3, 4, kVar));
    }
}
