package B1;

import J2.InterfaceC0328z;
import androidx.work.CoroutineWorker;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: B1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f289l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f290m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0017g(CoroutineWorker coroutineWorker, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f290m = coroutineWorker;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0017g) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0017g(this.f290m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f289l;
        CoroutineWorker coroutineWorker = this.f290m;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                this.f289l = 1;
                obj = coroutineWorker.f(this);
                if (obj == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            coroutineWorker.f6933m.j((q) obj);
        } catch (Throwable th) {
            coroutineWorker.f6933m.k(th);
        }
        return C0880v.f8657a;
    }
}
