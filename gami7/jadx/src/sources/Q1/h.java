package Q1;

import android.database.Cursor;
import j.C0750f;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n2.AbstractC0946A;
import n2.AbstractC0962n;
import r1.v;
import s.AbstractC1166e;

/* loaded from: classes.dex */
public final class h implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f5288b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f5289c;

    public /* synthetic */ h(k kVar, v vVar, int i2) {
        this.f5287a = i2;
        this.f5289c = kVar;
        this.f5288b = vVar;
    }

    private final Object a() {
        k kVar = this.f5289c;
        r1.r rVar = (r1.r) kVar.f5292a;
        rVar.c();
        try {
            Cursor p3 = AbstractC0946A.p(rVar, this.f5288b, true);
            try {
                int j3 = AbstractC0962n.j(p3, "id");
                int j4 = AbstractC0962n.j(p3, "clientId");
                int j5 = AbstractC0962n.j(p3, "templateId");
                int j6 = AbstractC0962n.j(p3, "scheduledDate");
                int j7 = AbstractC0962n.j(p3, "scheduledTime");
                int j8 = AbstractC0962n.j(p3, "status");
                int j9 = AbstractC0962n.j(p3, "retryCount");
                int j10 = AbstractC0962n.j(p3, "campaignId");
                int j11 = AbstractC0962n.j(p3, "week");
                int j12 = AbstractC0962n.j(p3, "message");
                C0750f c0750f = new C0750f(0);
                while (p3.moveToNext()) {
                    c0750f.put(p3.getString(j4), null);
                }
                p3.moveToPosition(-1);
                kVar.a(c0750f);
                ArrayList arrayList = new ArrayList(p3.getCount());
                while (p3.moveToNext()) {
                    String string = p3.getString(j3);
                    String string2 = p3.getString(j4);
                    String string3 = p3.getString(j5);
                    String string4 = p3.getString(j6);
                    String string5 = p3.getString(j7);
                    String string6 = p3.getString(j8);
                    int i2 = j3;
                    ((C1.b) kVar.f5294c).getClass();
                    arrayList.add(new R1.g(new R1.f(string, string2, string3, string4, string5, C1.b.n(string6), p3.getInt(j9), p3.isNull(j10) ? null : p3.getString(j10), p3.getString(j11), p3.getString(j12)), (R1.b) c0750f.get(p3.getString(j4))));
                    kVar = kVar;
                    j3 = i2;
                }
                rVar.o();
                p3.close();
                return arrayList;
            } catch (Throwable th) {
                p3.close();
                throw th;
            }
        } finally {
            rVar.j();
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Cursor p3;
        r1.r rVar;
        Cursor p4;
        Boolean bool;
        switch (this.f5287a) {
            case 0:
                k kVar = this.f5289c;
                p3 = AbstractC0946A.p((r1.r) kVar.f5292a, this.f5288b, false);
                try {
                    int j3 = AbstractC0962n.j(p3, "id");
                    int j4 = AbstractC0962n.j(p3, "clientId");
                    int j5 = AbstractC0962n.j(p3, "templateId");
                    int j6 = AbstractC0962n.j(p3, "scheduledDate");
                    int j7 = AbstractC0962n.j(p3, "scheduledTime");
                    int j8 = AbstractC0962n.j(p3, "status");
                    int j9 = AbstractC0962n.j(p3, "retryCount");
                    int j10 = AbstractC0962n.j(p3, "campaignId");
                    int j11 = AbstractC0962n.j(p3, "week");
                    int j12 = AbstractC0962n.j(p3, "message");
                    ArrayList arrayList = new ArrayList(p3.getCount());
                    while (p3.moveToNext()) {
                        String string = p3.getString(j3);
                        String string2 = p3.getString(j4);
                        String string3 = p3.getString(j5);
                        String string4 = p3.getString(j6);
                        String string5 = p3.getString(j7);
                        String string6 = p3.getString(j8);
                        ((C1.b) kVar.f5294c).getClass();
                        arrayList.add(new R1.f(string, string2, string3, string4, string5, C1.b.n(string6), p3.getInt(j9), p3.isNull(j10) ? null : p3.getString(j10), p3.getString(j11), p3.getString(j12)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                k kVar2 = this.f5289c;
                rVar = (r1.r) kVar2.f5292a;
                rVar.c();
                try {
                    p3 = AbstractC0946A.p(rVar, this.f5288b, true);
                    try {
                        int j13 = AbstractC0962n.j(p3, "id");
                        int j14 = AbstractC0962n.j(p3, "clientId");
                        int j15 = AbstractC0962n.j(p3, "templateId");
                        int j16 = AbstractC0962n.j(p3, "scheduledDate");
                        int j17 = AbstractC0962n.j(p3, "scheduledTime");
                        int j18 = AbstractC0962n.j(p3, "status");
                        int j19 = AbstractC0962n.j(p3, "retryCount");
                        int j20 = AbstractC0962n.j(p3, "campaignId");
                        int j21 = AbstractC0962n.j(p3, "week");
                        int j22 = AbstractC0962n.j(p3, "message");
                        C0750f c0750f = new C0750f(0);
                        while (p3.moveToNext()) {
                            c0750f.put(p3.getString(j14), null);
                        }
                        p3.moveToPosition(-1);
                        kVar2.a(c0750f);
                        ArrayList arrayList2 = new ArrayList(p3.getCount());
                        while (p3.moveToNext()) {
                            String string7 = p3.getString(j13);
                            String string8 = p3.getString(j14);
                            String string9 = p3.getString(j15);
                            String string10 = p3.getString(j16);
                            String string11 = p3.getString(j17);
                            String string12 = p3.getString(j18);
                            int i2 = j13;
                            ((C1.b) kVar2.f5294c).getClass();
                            arrayList2.add(new R1.g(new R1.f(string7, string8, string9, string10, string11, C1.b.n(string12), p3.getInt(j19), p3.isNull(j20) ? null : p3.getString(j20), p3.getString(j21), p3.getString(j22)), (R1.b) c0750f.get(p3.getString(j14))));
                            kVar2 = kVar2;
                            j13 = i2;
                        }
                        rVar.o();
                        return arrayList2;
                    } catch (Throwable th) {
                        throw th;
                    }
                } finally {
                }
            case 2:
                k kVar3 = this.f5289c;
                rVar = (r1.r) kVar3.f5292a;
                rVar.c();
                try {
                    p3 = AbstractC0946A.p(rVar, this.f5288b, true);
                    try {
                        int j23 = AbstractC0962n.j(p3, "id");
                        int j24 = AbstractC0962n.j(p3, "clientId");
                        int j25 = AbstractC0962n.j(p3, "templateId");
                        int j26 = AbstractC0962n.j(p3, "scheduledDate");
                        int j27 = AbstractC0962n.j(p3, "scheduledTime");
                        int j28 = AbstractC0962n.j(p3, "status");
                        int j29 = AbstractC0962n.j(p3, "retryCount");
                        int j30 = AbstractC0962n.j(p3, "campaignId");
                        int j31 = AbstractC0962n.j(p3, "week");
                        int j32 = AbstractC0962n.j(p3, "message");
                        C0750f c0750f2 = new C0750f(0);
                        while (p3.moveToNext()) {
                            c0750f2.put(p3.getString(j24), null);
                        }
                        p3.moveToPosition(-1);
                        kVar3.a(c0750f2);
                        ArrayList arrayList3 = new ArrayList(p3.getCount());
                        while (p3.moveToNext()) {
                            String string13 = p3.getString(j23);
                            String string14 = p3.getString(j24);
                            String string15 = p3.getString(j25);
                            String string16 = p3.getString(j26);
                            String string17 = p3.getString(j27);
                            String string18 = p3.getString(j28);
                            int i3 = j23;
                            ((C1.b) kVar3.f5294c).getClass();
                            arrayList3.add(new R1.g(new R1.f(string13, string14, string15, string16, string17, C1.b.n(string18), p3.getInt(j29), p3.isNull(j30) ? null : p3.getString(j30), p3.getString(j31), p3.getString(j32)), (R1.b) c0750f2.get(p3.getString(j24))));
                            kVar3 = kVar3;
                            j23 = i3;
                        }
                        rVar.o();
                        return arrayList3;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } finally {
                }
            case 3:
                k kVar4 = this.f5289c;
                p4 = AbstractC0946A.p((r1.r) kVar4.f5292a, this.f5288b, false);
                try {
                    int j33 = AbstractC0962n.j(p4, "id");
                    int j34 = AbstractC0962n.j(p4, "clientId");
                    int j35 = AbstractC0962n.j(p4, "templateId");
                    int j36 = AbstractC0962n.j(p4, "scheduledDate");
                    int j37 = AbstractC0962n.j(p4, "scheduledTime");
                    int j38 = AbstractC0962n.j(p4, "status");
                    int j39 = AbstractC0962n.j(p4, "retryCount");
                    int j40 = AbstractC0962n.j(p4, "campaignId");
                    int j41 = AbstractC0962n.j(p4, "week");
                    int j42 = AbstractC0962n.j(p4, "message");
                    ArrayList arrayList4 = new ArrayList(p4.getCount());
                    while (p4.moveToNext()) {
                        String string19 = p4.getString(j33);
                        String string20 = p4.getString(j34);
                        String string21 = p4.getString(j35);
                        String string22 = p4.getString(j36);
                        String string23 = p4.getString(j37);
                        String string24 = p4.getString(j38);
                        int i4 = j33;
                        ((C1.b) kVar4.f5294c).getClass();
                        arrayList4.add(new R1.f(string19, string20, string21, string22, string23, C1.b.n(string24), p4.getInt(j39), p4.isNull(j40) ? null : p4.getString(j40), p4.getString(j41), p4.getString(j42)));
                        j33 = i4;
                    }
                    return arrayList4;
                } finally {
                }
            case 4:
                k kVar5 = this.f5289c;
                p4 = AbstractC0946A.p((r1.r) kVar5.f5292a, this.f5288b, false);
                try {
                    int j43 = AbstractC0962n.j(p4, "id");
                    int j44 = AbstractC0962n.j(p4, "clientId");
                    int j45 = AbstractC0962n.j(p4, "templateId");
                    int j46 = AbstractC0962n.j(p4, "scheduledDate");
                    int j47 = AbstractC0962n.j(p4, "scheduledTime");
                    int j48 = AbstractC0962n.j(p4, "status");
                    int j49 = AbstractC0962n.j(p4, "retryCount");
                    int j50 = AbstractC0962n.j(p4, "campaignId");
                    int j51 = AbstractC0962n.j(p4, "week");
                    int j52 = AbstractC0962n.j(p4, "message");
                    if (p4.moveToFirst()) {
                        String string25 = p4.getString(j43);
                        String string26 = p4.getString(j44);
                        String string27 = p4.getString(j45);
                        String string28 = p4.getString(j46);
                        String string29 = p4.getString(j47);
                        String string30 = p4.getString(j48);
                        ((C1.b) kVar5.f5294c).getClass();
                        r15 = new R1.f(string25, string26, string27, string28, string29, C1.b.n(string30), p4.getInt(j49), p4.isNull(j50) ? null : p4.getString(j50), p4.getString(j51), p4.getString(j52));
                    }
                    return r15;
                } finally {
                }
            case AbstractC1166e.f10138f /* 5 */:
                k kVar6 = this.f5289c;
                p4 = AbstractC0946A.p((r1.r) kVar6.f5292a, this.f5288b, false);
                try {
                    int j53 = AbstractC0962n.j(p4, "id");
                    int j54 = AbstractC0962n.j(p4, "clientId");
                    int j55 = AbstractC0962n.j(p4, "templateId");
                    int j56 = AbstractC0962n.j(p4, "scheduledDate");
                    int j57 = AbstractC0962n.j(p4, "scheduledTime");
                    int j58 = AbstractC0962n.j(p4, "status");
                    int j59 = AbstractC0962n.j(p4, "retryCount");
                    int j60 = AbstractC0962n.j(p4, "campaignId");
                    int j61 = AbstractC0962n.j(p4, "week");
                    int j62 = AbstractC0962n.j(p4, "message");
                    ArrayList arrayList5 = new ArrayList(p4.getCount());
                    while (p4.moveToNext()) {
                        String string31 = p4.getString(j53);
                        String string32 = p4.getString(j54);
                        String string33 = p4.getString(j55);
                        String string34 = p4.getString(j56);
                        String string35 = p4.getString(j57);
                        String string36 = p4.getString(j58);
                        int i5 = j53;
                        ((C1.b) kVar6.f5294c).getClass();
                        arrayList5.add(new R1.f(string31, string32, string33, string34, string35, C1.b.n(string36), p4.getInt(j59), p4.isNull(j60) ? null : p4.getString(j60), p4.getString(j61), p4.getString(j62)));
                        j53 = i5;
                    }
                    return arrayList5;
                } finally {
                }
            case AbstractC1166e.f10136d /* 6 */:
                k kVar7 = this.f5289c;
                p4 = AbstractC0946A.p((r1.r) kVar7.f5292a, this.f5288b, false);
                try {
                    int j63 = AbstractC0962n.j(p4, "id");
                    int j64 = AbstractC0962n.j(p4, "clientId");
                    int j65 = AbstractC0962n.j(p4, "templateId");
                    int j66 = AbstractC0962n.j(p4, "scheduledDate");
                    int j67 = AbstractC0962n.j(p4, "scheduledTime");
                    int j68 = AbstractC0962n.j(p4, "status");
                    int j69 = AbstractC0962n.j(p4, "retryCount");
                    int j70 = AbstractC0962n.j(p4, "campaignId");
                    int j71 = AbstractC0962n.j(p4, "week");
                    int j72 = AbstractC0962n.j(p4, "message");
                    ArrayList arrayList6 = new ArrayList(p4.getCount());
                    while (p4.moveToNext()) {
                        String string37 = p4.getString(j63);
                        String string38 = p4.getString(j64);
                        String string39 = p4.getString(j65);
                        String string40 = p4.getString(j66);
                        String string41 = p4.getString(j67);
                        String string42 = p4.getString(j68);
                        int i6 = j63;
                        ((C1.b) kVar7.f5294c).getClass();
                        arrayList6.add(new R1.f(string37, string38, string39, string40, string41, C1.b.n(string42), p4.getInt(j69), p4.isNull(j70) ? null : p4.getString(j70), p4.getString(j71), p4.getString(j72)));
                        j63 = i6;
                    }
                    return arrayList6;
                } finally {
                }
            case 7:
                p4 = AbstractC0946A.p((r1.r) this.f5289c.f5292a, this.f5288b, false);
                try {
                    if (p4.moveToFirst()) {
                        bool = Boolean.valueOf(p4.getInt(0) != 0);
                    } else {
                        bool = Boolean.FALSE;
                    }
                    return bool;
                } finally {
                }
            case 8:
                p4 = AbstractC0946A.p((r1.r) this.f5289c.f5292a, this.f5288b, false);
                try {
                    ArrayList arrayList7 = new ArrayList(p4.getCount());
                    while (p4.moveToNext()) {
                        arrayList7.add(p4.getString(0));
                    }
                    return arrayList7;
                } finally {
                }
            case AbstractC1166e.f10135c /* 9 */:
                k kVar8 = this.f5289c;
                p4 = AbstractC0946A.p((r1.r) kVar8.f5292a, this.f5288b, false);
                try {
                    int j73 = AbstractC0962n.j(p4, "id");
                    int j74 = AbstractC0962n.j(p4, "clientId");
                    int j75 = AbstractC0962n.j(p4, "templateId");
                    int j76 = AbstractC0962n.j(p4, "scheduledDate");
                    int j77 = AbstractC0962n.j(p4, "scheduledTime");
                    int j78 = AbstractC0962n.j(p4, "status");
                    int j79 = AbstractC0962n.j(p4, "retryCount");
                    int j80 = AbstractC0962n.j(p4, "campaignId");
                    int j81 = AbstractC0962n.j(p4, "week");
                    int j82 = AbstractC0962n.j(p4, "message");
                    if (p4.moveToFirst()) {
                        String string43 = p4.getString(j73);
                        String string44 = p4.getString(j74);
                        String string45 = p4.getString(j75);
                        String string46 = p4.getString(j76);
                        String string47 = p4.getString(j77);
                        String string48 = p4.getString(j78);
                        ((C1.b) kVar8.f5294c).getClass();
                        r15 = new R1.f(string43, string44, string45, string46, string47, C1.b.n(string48), p4.getInt(j79), p4.isNull(j80) ? null : p4.getString(j80), p4.getString(j81), p4.getString(j82));
                    }
                    return r15;
                } finally {
                }
            case AbstractC1166e.f10137e /* 10 */:
                return a();
            default:
                p3 = AbstractC0946A.p((r1.r) this.f5289c.f5292a, this.f5288b, false);
                try {
                    return p3.moveToFirst() ? new R1.d(p3.getInt(0), p3.getInt(1), p3.getInt(2)) : null;
                } finally {
                }
        }
    }

    public void finalize() {
        switch (this.f5287a) {
            case 0:
                this.f5288b.c();
                break;
            case 1:
                this.f5288b.c();
                break;
            case 2:
                this.f5288b.c();
                break;
            case AbstractC1166e.f10137e /* 10 */:
                this.f5288b.c();
                break;
            case 11:
                this.f5288b.c();
                break;
            default:
                super.finalize();
                break;
        }
    }
}
