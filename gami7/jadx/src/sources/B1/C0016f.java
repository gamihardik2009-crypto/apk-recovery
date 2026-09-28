package B1;

import J2.InterfaceC0328z;
import androidx.work.CoroutineWorker;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* renamed from: B1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016f extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public m f285l;

    /* renamed from: m, reason: collision with root package name */
    public int f286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f287n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f288o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0016f(m mVar, CoroutineWorker coroutineWorker, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f287n = mVar;
        this.f288o = coroutineWorker;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0016f) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0016f(this.f287n, this.f288o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        m mVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f286m;
        if (i2 == 0) {
            C1.y.J(obj);
            m mVar2 = this.f287n;
            this.f285l = mVar2;
            this.f286m = 1;
            Object g3 = this.f288o.g();
            if (g3 == enumC1145a) {
                return enumC1145a;
            }
            mVar = mVar2;
            obj = g3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = this.f285l;
            C1.y.J(obj);
        }
        mVar.f298a.j(obj);
        return C0880v.f8657a;
    }
}
