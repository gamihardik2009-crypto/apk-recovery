package H;

import J2.InterfaceC0328z;
import java.util.Collection;
import java.util.Iterator;
import m2.C0880v;
import n2.AbstractC0974z;

/* renamed from: H.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184r1 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E2.d f3051i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u.x f3052j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f3053k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f3054l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f3055m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3056n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f3057o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ y2.c f3058p;
    public final /* synthetic */ InterfaceC0180q3 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B0 f3059r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184r1(E2.d dVar, u.x xVar, InterfaceC0328z interfaceC0328z, String str, String str2, int i2, int i3, y2.c cVar, InterfaceC0180q3 interfaceC0180q3, B0 b02) {
        super(1);
        this.f3051i = dVar;
        this.f3052j = xVar;
        this.f3053k = interfaceC0328z;
        this.f3054l = str;
        this.f3055m = str2;
        this.f3056n = i2;
        this.f3057o = i3;
        this.f3058p = cVar;
        this.q = interfaceC0180q3;
        this.f3059r = b02;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        int i2;
        u.h hVar = (u.h) obj;
        Iterable iterable = this.f3051i;
        z2.h.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            int i3 = 0;
            while (((E2.c) it).f1081j) {
                ((AbstractC0974z) it).next();
                i3++;
                if (i3 < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
            i2 = i3;
        }
        R.a aVar = new R.a(1040623618, new C0178q1(this.f3051i, this.f3052j, this.f3053k, this.f3054l, this.f3055m, this.f3056n, this.f3057o, this.f3058p, this.q, this.f3059r), true);
        u.o oVar = u.o.f10737k;
        hVar.getClass();
        hVar.f10692b.a(i2, new u.f(null, u.g.f10688j, oVar, aVar));
        return C0880v.f8657a;
    }
}
