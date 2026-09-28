package o1;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n1.C0945f;
import n1.D;
import n2.AbstractC0946A;
import n2.AbstractC0963o;
import n2.C0958j;

/* loaded from: classes.dex */
public final class p extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final p f9261i = new p(2);

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        Bundle bundle;
        n1.y yVar = (n1.y) obj2;
        yVar.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : AbstractC0946A.u(yVar.f9136v.f9015a).entrySet()) {
            ((D) entry.getValue()).getClass();
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        C0958j c0958j = yVar.f9122g;
        if (!c0958j.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c0958j.f9163j];
            Iterator<E> it = c0958j.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new n1.g((C0945f) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = yVar.f9128m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i3 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i3] = intValue;
                arrayList2.add(str);
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = yVar.f9129n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                C0958j c0958j2 = (C0958j) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[c0958j2.f9163j];
                Iterator it2 = c0958j2.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0963o.y();
                        throw null;
                    }
                    parcelableArr2[i4] = (n1.g) next;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (yVar.f9121f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", yVar.f9121f);
        }
        return bundle;
    }
}
