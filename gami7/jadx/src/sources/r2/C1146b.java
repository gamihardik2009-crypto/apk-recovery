package r2;

import C1.y;
import q2.InterfaceC1073d;
import s2.AbstractC1202g;
import y2.e;
import z2.h;
import z2.v;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146b extends AbstractC1202g {

    /* renamed from: i, reason: collision with root package name */
    public int f10030i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f10031j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f10032k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146b(Object obj, InterfaceC1073d interfaceC1073d, e eVar) {
        super(interfaceC1073d);
        this.f10031j = eVar;
        this.f10032k = obj;
        h.d(interfaceC1073d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        int i2 = this.f10030i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f10030i = 2;
            y.J(obj);
            return obj;
        }
        this.f10030i = 1;
        y.J(obj);
        e eVar = this.f10031j;
        h.d(eVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        v.d(2, eVar);
        return eVar.j(this.f10032k, this);
    }
}
