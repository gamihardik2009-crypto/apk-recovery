package P1;

import B1.v;
import C1.w;
import C1.y;
import J2.InterfaceC0328z;
import M2.P;
import Q1.p;
import android.util.Log;
import com.example.bulksmsscheduler.SmsApplication;
import com.example.bulksmsscheduler.utils.SmsWorker;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class o extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5261l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SmsApplication f5262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SmsApplication smsApplication, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5262m = smsApplication;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((o) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new o(this.f5262m, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5261l;
        SmsApplication smsApplication = this.f5262m;
        if (i2 == 0) {
            y.J(obj);
            G1.h hVar = smsApplication.a().f5317f;
            this.f5261l = 1;
            obj = P.i(hVar, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.J(obj);
                return C0880v.f8657a;
            }
            y.J(obj);
        }
        R1.a aVar = (R1.a) obj;
        if (aVar == null) {
            p a3 = smsApplication.a();
            R1.a aVar2 = new R1.a();
            this.f5261l = 2;
            if (a3.h(aVar2, this) == enumC1145a) {
                return enumC1145a;
            }
        } else if (aVar.f5472g) {
            z2.h.f(smsApplication, "context");
            Log.d("SmsWorker", "Enqueuing immediate worker");
            w.o0(smsApplication).O((B1.w) new v(SmsWorker.class, 0).a());
        }
        return C0880v.f8657a;
    }
}
