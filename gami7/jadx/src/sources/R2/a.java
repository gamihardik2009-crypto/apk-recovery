package R2;

import B1.F;
import J2.B;
import m2.C0880v;
import q2.InterfaceC1078i;

/* loaded from: classes.dex */
public final /* synthetic */ class a extends z2.f implements y2.f {

    /* renamed from: p, reason: collision with root package name */
    public static final a f5508p = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j3 = bVar.f5509a;
        C0880v c0880v = C0880v.f8657a;
        if (j3 <= 0) {
            ((e) fVar).f5528l = c0880v;
        } else {
            F f3 = new F(10, (Object) fVar, (Object) bVar, false);
            z2.h.d(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            e eVar = (e) fVar;
            InterfaceC1078i interfaceC1078i = eVar.f5524h;
            eVar.f5526j = B.i(interfaceC1078i).e(j3, f3, interfaceC1078i);
        }
        return c0880v;
    }
}
