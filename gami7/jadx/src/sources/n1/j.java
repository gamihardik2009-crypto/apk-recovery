package n1;

import m2.C0880v;
import n2.C0958j;

/* loaded from: classes.dex */
public final class j extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z2.o f9052i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z2.o f9053j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f9054k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f9055l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0958j f9056m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z2.o oVar, z2.o oVar2, y yVar, boolean z3, C0958j c0958j) {
        super(1);
        this.f9052i = oVar;
        this.f9053j = oVar2;
        this.f9054k = yVar;
        this.f9055l = z3;
        this.f9056m = c0958j;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        C0945f c0945f = (C0945f) obj;
        z2.h.f(c0945f, "entry");
        this.f9052i.f11905h = true;
        this.f9053j.f11905h = true;
        this.f9054k.p(c0945f, this.f9055l, this.f9056m);
        return C0880v.f8657a;
    }
}
