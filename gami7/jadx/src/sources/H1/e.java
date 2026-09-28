package H1;

import B1.s;
import K1.o;
import z2.h;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final int f3425b;

    static {
        h.e(s.f("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(I1.f fVar) {
        super(fVar);
        h.f(fVar, "tracker");
        this.f3425b = 7;
    }

    @Override // H1.d
    public final int a() {
        return this.f3425b;
    }

    @Override // H1.d
    public final boolean b(o oVar) {
        return oVar.f4573j.f275a == 5;
    }

    @Override // H1.d
    public final boolean c(Object obj) {
        G1.d dVar = (G1.d) obj;
        h.f(dVar, "value");
        return (dVar.f1231a && dVar.f1233c) ? false : true;
    }
}
