package U1;

import C1.y;
import J2.InterfaceC0328z;
import Q1.p;
import R1.f;
import android.app.PendingIntent;
import android.telephony.SmsManager;
import java.util.ArrayList;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import y2.e;

/* loaded from: classes.dex */
public final class a extends AbstractC1204i implements e {

    /* renamed from: l, reason: collision with root package name */
    public int f5776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SmsManager f5777m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f5778n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f5779o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f5780p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SmsManager smsManager, f fVar, d dVar, String str, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5777m = smsManager;
        this.f5778n = fVar;
        this.f5779o = dVar;
        this.f5780p = str;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((a) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new a(this.f5777m, this.f5778n, this.f5779o, this.f5780p, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5776l;
        if (i2 == 0) {
            y.J(obj);
            f fVar = this.f5778n;
            ArrayList<String> divideMessage = this.f5777m.divideMessage(fVar.f5505j);
            int size = divideMessage.size();
            R1.c cVar = R1.c.f5484i;
            String str = fVar.f5496a;
            d dVar = this.f5779o;
            if (size > 1) {
                ArrayList<PendingIntent> arrayList = new ArrayList<>();
                int size2 = divideMessage.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList.add(d.a(dVar, str, i3));
                }
                try {
                    this.f5777m.sendMultipartTextMessage(this.f5780p, null, divideMessage, arrayList, null);
                } catch (Exception unused) {
                    p pVar = dVar.f5788b;
                    f a3 = f.a(this.f5778n, null, null, null, cVar, 0, null, 991);
                    this.f5776l = 1;
                    if (pVar.g(a3, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            } else {
                try {
                    this.f5777m.sendTextMessage(this.f5780p, null, fVar.f5505j, d.a(dVar, str, 0), null);
                } catch (Exception unused2) {
                    f a4 = f.a(this.f5778n, null, null, null, cVar, 0, null, 991);
                    this.f5776l = 2;
                    if (dVar.f5788b.g(a4, this) == enumC1145a) {
                        return enumC1145a;
                    }
                }
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.J(obj);
        }
        return C0880v.f8657a;
    }
}
