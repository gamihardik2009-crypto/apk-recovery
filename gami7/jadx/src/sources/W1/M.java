package W1;

import J2.InterfaceC0328z;
import M2.d0;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import m2.C0880v;
import n2.AbstractC0949a;
import n2.AbstractC0961m;
import n2.AbstractC0964p;
import n2.C0972x;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class M extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public int f5950l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P f5951m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f5952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p3, Context context, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f5951m = p3;
        this.f5952n = context;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((M) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new M(this.f5951m, this.f5952n, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        String str;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f5950l;
        P p3 = this.f5951m;
        try {
            if (i2 == 0) {
                C1.y.J(obj);
                Q1.p pVar = p3.f5959b;
                this.f5950l = 1;
                obj = pVar.a(this);
                if (obj == enumC1145a) {
                    return enumC1145a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1.y.J(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC0964p.z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((R1.b) it.next()).f5477c);
            }
            Set b02 = AbstractC0961m.b0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Cursor query = this.f5952n.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "display_name ASC");
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex("display_name");
                    int columnIndex2 = query.getColumnIndex("data1");
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex);
                        if (string == null) {
                            string = "Unknown";
                        }
                        String string2 = query.getString(columnIndex2);
                        if (string2 != null) {
                            Pattern compile = Pattern.compile("[^0-9+]");
                            z2.h.e(compile, "compile(...)");
                            str = compile.matcher(string2).replaceAll("");
                            z2.h.e(str, "replaceAll(...)");
                        } else {
                            str = "";
                        }
                        if (str.length() > 0) {
                            arrayList2.add(new U(string, str, b02.contains(str)));
                        }
                    }
                    AbstractC0949a.h(query, null);
                } finally {
                }
            }
            d0 d0Var = p3.f5963f;
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (hashSet.add(((U) next).f6003b)) {
                    arrayList3.add(next);
                }
            }
            d0Var.k(arrayList3);
            p3.f5964g.k(C0972x.f9167h);
            p3.f5961d.k("");
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return C0880v.f8657a;
    }
}
