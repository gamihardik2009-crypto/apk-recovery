package R2;

import J2.J;
import O2.t;
import O2.v;
import q2.InterfaceC1073d;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5510a;

    /* renamed from: b, reason: collision with root package name */
    public final y2.f f5511b;

    /* renamed from: c, reason: collision with root package name */
    public final y2.f f5512c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5513d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5514e;

    /* renamed from: f, reason: collision with root package name */
    public final y2.f f5515f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5516g;

    /* renamed from: h, reason: collision with root package name */
    public int f5517h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f5518i;

    public c(e eVar, Object obj, y2.f fVar, y2.f fVar2, v vVar, AbstractC1204i abstractC1204i, y2.f fVar3) {
        this.f5518i = eVar;
        this.f5510a = obj;
        this.f5511b = fVar;
        this.f5512c = fVar2;
        this.f5513d = vVar;
        this.f5514e = abstractC1204i;
        this.f5515f = fVar3;
    }

    public final void a() {
        Object obj = this.f5516g;
        if (obj instanceof t) {
            ((t) obj).g(this.f5517h, this.f5518i.f5524h);
            return;
        }
        J j3 = obj instanceof J ? (J) obj : null;
        if (j3 != null) {
            j3.a();
        }
    }

    public final Object b(Object obj, InterfaceC1073d interfaceC1073d) {
        v vVar = h.f5534e;
        Object obj2 = this.f5514e;
        if (this.f5513d == vVar) {
            z2.h.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((y2.c) obj2).l(interfaceC1073d);
        }
        z2.h.d(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((y2.e) obj2).j(obj, interfaceC1073d);
    }
}
