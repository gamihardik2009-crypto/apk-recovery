package Q1;

import C1.y;
import java.util.List;
import m2.C0880v;
import n2.AbstractC0949a;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class o extends AbstractC1204i implements y2.c {

    /* renamed from: l, reason: collision with root package name */
    public int f5308l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f5310n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f5311o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z3, p pVar, List list, InterfaceC1073d interfaceC1073d) {
        super(1, interfaceC1073d);
        this.f5309m = z3;
        this.f5310n = pVar;
        this.f5311o = list;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        return new o(this.f5309m, this.f5310n, this.f5311o, (InterfaceC1073d) obj).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5308l;
        p pVar = this.f5310n;
        if (i2 == 0) {
            y.J(obj);
            if (this.f5309m) {
                k r3 = pVar.f5312a.r();
                this.f5308l = 1;
                r3.getClass();
                if (AbstractC0949a.k((r1.r) r3.f5292a, new g(r3, 0), this) == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                k r4 = pVar.f5312a.r();
                this.f5308l = 2;
                r4.getClass();
                if (AbstractC0949a.k((r1.r) r4.f5292a, new g(r4, 1), this) == enumC1145a) {
                    return enumC1145a;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.J(obj);
                return C0880v.f8657a;
            }
            y.J(obj);
        }
        k r5 = pVar.f5312a.r();
        this.f5308l = 3;
        r5.getClass();
        if (AbstractC0949a.k((r1.r) r5.f5292a, new f(r5, this.f5311o, 1), this) == enumC1145a) {
            return enumC1145a;
        }
        return C0880v.f8657a;
    }
}
