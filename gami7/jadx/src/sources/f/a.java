package f;

import B1.C;
import N.e;
import a.AbstractC0423a;
import android.content.Intent;
import b.AbstractActivityC0489m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import n2.AbstractC0946A;
import n2.AbstractC0961m;
import n2.C0971w;
import z2.h;

/* loaded from: classes.dex */
public final class a extends C {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7585f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2) {
        super(25);
        this.f7585f = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B1.C
    public final Intent N(AbstractActivityC0489m abstractActivityC0489m, Serializable serializable) {
        switch (this.f7585f) {
            case 0:
                h.f(abstractActivityC0489m, "context");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType((String) serializable);
                h.e(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            case 1:
                h.f(abstractActivityC0489m, "context");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) serializable);
                h.e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            default:
                h.f(abstractActivityC0489m, "context");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) serializable});
                h.e(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B1.C
    public final e Y(AbstractActivityC0489m abstractActivityC0489m, Serializable serializable) {
        switch (this.f7585f) {
            case 0:
                h.f(abstractActivityC0489m, "context");
                return null;
            case 1:
                String[] strArr = (String[]) serializable;
                h.f(abstractActivityC0489m, "context");
                if (strArr.length == 0) {
                    return new e(C0971w.f9166h);
                }
                for (String str : strArr) {
                    if (AbstractC0423a.D(abstractActivityC0489m, str) != 0) {
                        return null;
                    }
                }
                int m3 = AbstractC0946A.m(strArr.length);
                if (m3 < 16) {
                    m3 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m3);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new e(linkedHashMap);
            default:
                h.f(abstractActivityC0489m, "context");
                if (AbstractC0423a.D(abstractActivityC0489m, (String) serializable) == 0) {
                    return new e(Boolean.TRUE);
                }
                return null;
        }
    }

    @Override // B1.C
    public final Object g0(Intent intent, int i2) {
        switch (this.f7585f) {
            case 0:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                C0971w c0971w = C0971w.f9166h;
                if (i2 != -1 || intent == null) {
                    return c0971w;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c0971w;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i3 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i3 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                return AbstractC0946A.t(AbstractC0961m.c0(arrayList2, arrayList));
            default:
                if (intent == null || i2 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z3 = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (intArrayExtra2[i4] == 0) {
                                z3 = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z3);
        }
    }
}
