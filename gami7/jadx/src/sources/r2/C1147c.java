package r2;

import C1.y;
import q2.InterfaceC1073d;
import q2.InterfaceC1078i;
import s2.AbstractC1198c;
import y2.e;
import z2.h;
import z2.v;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147c extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public int f10033k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f10034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f10035m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147c(InterfaceC1073d interfaceC1073d, InterfaceC1078i interfaceC1078i, e eVar, Object obj) {
        super(interfaceC1073d, interfaceC1078i);
        this.f10034l = eVar;
        this.f10035m = obj;
        h.d(interfaceC1073d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        int i2 = this.f10033k;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10033k = 2;
            y.J(obj);
            return obj;
        }
        this.f10033k = 1;
        y.J(obj);
        e eVar = this.f10034l;
        h.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.d(2, eVar);
        return eVar.j(this.f10035m, this);
    }
}
