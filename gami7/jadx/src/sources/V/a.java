package V;

import C0.C0018a;
import J.C0285q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5828a = new d(-1.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final d f5829b = new d(1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final StackTraceElement[] f5830c = new StackTraceElement[0];

    public static final boolean a(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final o b(o oVar, y2.f fVar) {
        return oVar.k(new j(fVar));
    }

    public static final o c(C0285q c0285q, o oVar) {
        if (oVar.c(k.f5856i)) {
            return oVar;
        }
        c0285q.V(1219399079);
        o oVar2 = (o) oVar.e(l.f5857b, new C0018a(9, c0285q));
        c0285q.r(false);
        return oVar2;
    }

    public static final o d(C0285q c0285q, o oVar) {
        c0285q.U(439770924);
        o c3 = c(c0285q, oVar);
        c0285q.r(false);
        return c3;
    }
}
